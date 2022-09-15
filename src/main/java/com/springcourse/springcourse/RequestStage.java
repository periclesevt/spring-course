package com.springcourse.springcourse;


import com.springcourse.springcourse.domain.enums.RequestState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
public class RequestStage {
    private Long id;
    private Date realizationDate;
    private String description;
    private RequestState state;
    private Request request;
    private User user;
}
