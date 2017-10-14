package com.KIM.TestJava.Controller;

import com.KIM.TestJava.Storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/download")
public class DownloadController {
//    private final StorageService storageService;

//    @Autowired
//    public DownloadController(StorageService storageService) {
//        this.storageService = storageService;
//    }

//    @GetMapping
//    @ResponseBody
//    public ResponseEntity<Resource> download() {
//        Resource file = storageService.loadAsResource("");
//        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
//                "attachment; filename=\"" + file.getFilename() + "\"").body(file);
//    }
}
