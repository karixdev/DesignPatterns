package com.github.karixdev.decorator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
public record User(String firstname, boolean facebookConnected, boolean discordConnected) {
}
