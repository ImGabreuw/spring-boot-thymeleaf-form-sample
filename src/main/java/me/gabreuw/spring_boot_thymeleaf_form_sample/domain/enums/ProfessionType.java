package me.gabreuw.spring_boot_thymeleaf_form_sample.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public enum ProfessionType {
    DEVELOPER("Developer"),
    DESIGNER("Designer"),
    ARCHITECT("Architect");

    @Getter
    private final String name;

    public static List<String> getAllProfessionNames() {
        return Arrays.stream(ProfessionType.values())
                .map(ProfessionType::getName)
                .collect(Collectors.toList());
    }
}
