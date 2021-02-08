package by.resliv.telegramBot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CityUpdateDto {
    private String name;
    private String info;
}
