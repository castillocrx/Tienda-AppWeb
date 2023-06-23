/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Daniel
 */
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    final String BucketName = "techshop-a721e.appspot.com";
    final String rutaSuperiorStorage = "techshop";
    final String rutaJsonFile = "firebase";
    final String archivoJsonFile = "techshop-a721e-firebase-adminsdk-uq7xg-5f283af4fd";
}
