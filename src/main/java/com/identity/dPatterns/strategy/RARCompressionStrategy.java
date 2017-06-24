package com.identity.dPatterns.strategy;

import java.util.List;

/**
 * Created by ajkumar on 4/29/17.
 */
public class RARCompressionStrategy implements CompressionStrategy{
    public void compressFiles(List<String> files) {
        System.out.println("RARCompression selected");
    }
}
