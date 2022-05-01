package edu.ren.datastructure.stack;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rrn3194 on 11/1/18.
 */
public class SymbolFactory {
    public Map<Character, Symbol> symbolMap = new HashMap<>();

    public SymbolFactory() {
        registerSymbol(new Symbol('{', true, '}'));
        registerSymbol(new Symbol('[', true, ']'));
        registerSymbol(new Symbol('(', true, ')'));

        registerSymbol(new Symbol('}', false, '{'));
        registerSymbol(new Symbol(']', false, '['));
        registerSymbol(new Symbol(')', false, '('));
    }

    private void registerSymbol(Symbol symbol) {
        symbolMap.put(symbol.getSymbol(), symbol);
    }

    public Symbol getSymbol(Character symbol) {
        return symbolMap.get(symbol);
    }

}
