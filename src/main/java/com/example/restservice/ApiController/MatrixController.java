package com.example.restservice.ApiController;


import java.util.concurrent.atomic.AtomicLong;

import com.example.restservice.models.Matrix;
import org.springframework.web.bind.annotation.*;

@RestController
public class MatrixController {

    @CrossOrigin("http://localhost:8081")
    @RequestMapping(value = "/calculate-matrix", method = RequestMethod.POST)
    public int[][] calculateMatrix(@RequestBody Matrix matrix) {

        matrix.print();

        return matrix.transparent();
    }
}