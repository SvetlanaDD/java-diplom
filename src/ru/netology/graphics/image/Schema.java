package ru.netology.graphics.image;

import java.util.List;

public class Schema implements TextColorSchema {

    protected List<String> symbols;

    public Schema(List<String> symbols) {
        this.symbols = symbols;
    }

    @Override
    public char convert(int color) {
        return (symbols.get(symbols.size() * color / 256)).charAt(0);
    }
}
