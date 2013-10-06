package com.ctlok.rythm.demo.controller;

import javax.annotation.PostConstruct;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ctlok.rythm.demo.data.PersonalInfoFormData;
import com.ctlok.springframework.web.servlet.view.rythm.controller.SimpleFormController;
import com.ctlok.springframework.web.servlet.view.rythm.form.Form;
import com.ctlok.springframework.web.servlet.view.rythm.form.FormFactory;

/**
 * 
 * @author Lawrence Cheung
 *
 */
@Controller
@RequestMapping(value = "/form-utils")
public class FormUtilsController extends SimpleFormController {

    private FormFactory<PersonalInfoFormData> personalInfoFormFactory;
    
    @PostConstruct
    public void postConstruct(){
        
        personalInfoFormFactory = createFormFactory(PersonalInfoFormData.class);
        
    }
    
    @RequestMapping(value = "input-text.html", method = RequestMethod.GET)
    public String inputText(final Model model){
        
        model.addAttribute("form", personalInfoFormFactory.createBlankForm());
        
        return "form_utils/personal_info_form";
        
    }
    
    @RequestMapping(value = "input-text.html", method = RequestMethod.POST)
    public String inputTextAction(
            @Valid final PersonalInfoFormData registerFormData,
            final BindingResult bindingResult,
            final Model model){
        
        final Form<PersonalInfoFormData> personalInfoForm = 
                personalInfoFormFactory.createForm(registerFormData, bindingResult);
        
        if (!personalInfoForm.hasErrors()){
            
            personalInfoForm.setActionSuccess(true);
            
        }
        
        model.addAttribute("form", personalInfoForm);
        
        return "form_utils/personal_info_form";
        
    }
    
    @RequestMapping(value = "input-text-existing-data.html", method = RequestMethod.GET)
    public String inputTextWithExistingData(final Model model){
        
        final PersonalInfoFormData personalInfoFormData = new PersonalInfoFormData();
        
        personalInfoFormData.setEmail("lawrence0819@gmail.com");
        
        personalInfoFormData.setFirstName("Lawrence");
        
        personalInfoFormData.setLastName("Cheung");
        
        model.addAttribute("form", personalInfoFormFactory.createForm(personalInfoFormData));
        
        return "form_utils/personal_info_form";
        
    }
    
}
