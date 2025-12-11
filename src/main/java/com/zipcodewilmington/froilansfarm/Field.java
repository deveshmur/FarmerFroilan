package com.zipcodewilmington.froilansfarm;

import java.util.List;

import com.zipcodewilmington.froilansfarm.Interfaces.CropRow;

import java.util.ArrayList;

public class Field {
    private List<CropRow> rows;

    public Field() {
        rows = new ArrayList<CropRow>();
    }

    public List<CropRow> getRows() {
        return rows;
    }

    public void setRows(List<CropRow> rows) {
        this.rows = rows;
    }

    public CropRow getRow(int i) {
        return rows.get(i);
    }

    public void addRow(CropRow row) {
        rows.add(row);
    }
}
