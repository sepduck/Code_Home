package com.k14.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Prod {
    private Object data;
    private int status;
    private String message;
}