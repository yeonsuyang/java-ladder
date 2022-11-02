package step3.domain;
import org.junit.jupiter.api.Test;
import step3.domain.Users;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class UsersTest {
    @Test
    void 이름은_5글자까지만_가능() {
        assertThatThrownBy(() -> new Users(List.of("namename")))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 인원수_반환() {
        assertThat(new Users(List.of("pobi","crong","jetty")).getUserCounts()).isEqualTo(3);
    }
}