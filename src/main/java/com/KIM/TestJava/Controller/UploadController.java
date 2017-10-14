package com.KIM.TestJava.Controller;

import com.KIM.TestJava.Storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(path = "/upload")
public class UploadController {
    @GetMapping
    public String uploadForm() {
        return "upload";
    }

    @PostMapping("/")
    public String uploadProcess(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {

        redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded " + file.getOriginalFilename() + "!");

        return "redirect:/data";
    }
}
