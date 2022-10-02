package advent.of.code.day.one;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Window {

    int first;
    int second;
    int third;

    public int sum() {
        return first + second + third;
    }

}
