package org.yascode.secondsystem.model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Application implements Serializable {

    private Long id;

    private String code;

    private String name;

}
