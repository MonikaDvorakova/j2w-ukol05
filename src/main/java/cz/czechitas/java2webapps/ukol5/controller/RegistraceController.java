package cz.czechitas.java2webapps.ukol5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.Period;

/**
 * Kontroler obsluhující registraci účastníků dětského tábora.
 */
@Controller
public class RegistraceController {

  @GetMapping("/")
  public ModelAndView formular() {
    ModelAndView modelAndView = new ModelAndView("formular");
    modelAndView.addObject("form", new RegistrationForm());
    return modelAndView;
  }

  @PostMapping("")
  public Object form(@ModelAttribute("form")@Valid RegistrationForm form, BindingResult bindingResult) {
    if (bindingResult.hasErrors()) {
      return "formular";
    }

    if (form.getSport() == null || form.getSport().size() < 2) {
      bindingResult.rejectValue("sport", "", "Vyber alespon dva sporty.");
      return "formular";
    }

    LocalDate birthDate = LocalDate.parse(form.getBirthday());
    Period period = birthDate.until(LocalDate.now());
    int age = period.getYears();

    if(age < 9 || age > 15) {
      bindingResult.rejectValue("birthday", "", "Vek ditete musi byt 9-15 let.");
      return "formular";
    }

    return new ModelAndView("registration_finished").addObject("form", form);
  }

}


