package com.KIM.TestJava.Controller;

import com.KIM.TestJava.Model.Catalog;
import com.KIM.TestJava.Model.Cd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.xstream.XStreamMarshaller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

@Controller
@RequestMapping(path = "/upload")
public class UploadController {
//    private final HttpServletRequest request;
    private final XStreamMarshaller xstream;

    @Autowired
//    public UploadController(HttpServletRequest request, XStreamMarshaller xstream) {
    public UploadController(XStreamMarshaller xstream) {
        this.xstream = xstream;
    }

    @GetMapping
    public String uploadForm() {
        return "upload";
    }

    @PostMapping
    public String uploadProcess(@RequestParam("file") MultipartFile file) throws IOException {
//        String fileName = file.getOriginalFilename();
//        String filePath = request.getServletContext().getRealPath("/" + File.separator + fileName);
//        file.transferTo(new File(filePath));
//        Catalog catalog = (Catalog)xstream.unmarshal(new StreamSource(getClass().getResourceAsStream(("/Catalog.xml"))));
//        Catalog newCatalog = (Catalog)xstream.unmarshal(new StreamSource(file.getInputStream()));

//        catalog.setCds(newCatalog.getCds());
//        xstream.marshal(catalog, new StreamResult(new FileOutputStream("/Catalog.xml")));

        Catalog catalog = new Catalog();
        HashMap<String, Cd> cds = new HashMap<>();
        Cd cd = new Cd();
        cds.put("firest_cd", cd);
        catalog.setCds(cds);
        xstream.marshal(catalog, new StreamResult(new FileOutputStream("Catalog-TEST.xml")));

        return "redirect:/data";
    }
}
