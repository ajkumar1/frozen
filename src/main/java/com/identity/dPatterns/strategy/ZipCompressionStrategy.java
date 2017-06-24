package com.identity.dPatterns.strategy;

import java.util.List;

/**
 * Created by ajkumar on 4/29/17.
 */
public class ZipCompressionStrategy implements CompressionStrategy{
    public void compressFiles(List<String> files) {
        System.out.println("ZIPCompression selected");
    }
}
