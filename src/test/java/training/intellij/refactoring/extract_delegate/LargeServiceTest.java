package training.intellij.refactoring.extract_delegate;

import org.junit.jupiter.api.Test;

class LargeServiceTest {

    private LargeService largeService;

    @Test
    void top1() {
        largeService.top1(1L, 2L);
    }

    @Test
    void top2() {
        int v = largeService.top2(1L);
    }
}