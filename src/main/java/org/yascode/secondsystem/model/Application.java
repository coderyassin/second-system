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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Application { ");
        stringBuilder.append("id : " + this.id +", " );
        stringBuilder.append("code : " + this.code +", " );
        stringBuilder.append("name : " + this.name);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
