package com.stlayyappa.api.dto;

import com.stlayyappa.api.entity.Language;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BhajanLyricsDTO {

    private Long id;

    private String name;

    private Language language;

    private String lyrics;
}
