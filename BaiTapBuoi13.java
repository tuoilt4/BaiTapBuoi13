package omg;

import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

public class BaiTapBuoi13 {

    @Test
    public void KtManv()
    {
        String manv = "NV332243203";
        assertThat(manv).isNotEmpty();
        assertThat(manv).isNotNull();
        assertThat(manv).hasSize(11);
        assertThat(manv).startsWith("NV");
        assertThat(manv).containsPattern("[N][V][\\d]{9}");

    }


}
