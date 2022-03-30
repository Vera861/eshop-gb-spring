package ru.gb.service;

import ru.gb.controller.PictureDto;

import java.util.Optional;

public interface PictureService {

    Optional<String> getPictureContentType(long id);

    Optional<PictureDto> getPictureDataById(long id);

    String createPicture(byte[] pictureData);

    boolean isPictureExists(long id);

}
