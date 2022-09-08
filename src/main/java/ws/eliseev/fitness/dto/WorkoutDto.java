package ws.eliseev.fitness.dto;

import lombok.*;

@EqualsAndHashCode(exclude = "id")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class WorkoutDto {

    /**
     * Поле id
     */
    private Long id;

    /**
     * Поле название упражнения
     */
    private String name;

    /**
     * Поле указания группы мышц
     */
    private String exercise;

    /**
     * Поле количество подходов
     */
    private int move;

    /**
     * Поле количество повторений
     */
    private int repeat;

    /**
     * Поле месторасположение для занятий
     */
    private String area;
}
