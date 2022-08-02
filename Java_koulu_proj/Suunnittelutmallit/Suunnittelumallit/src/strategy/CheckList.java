/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.List;

/**
 *
 * @author vadimzubchenko
 */
public class CheckList {

    private ListConverter listConverter;
    private List list;

    @Override
    public String toString() {
        return listConverter.listToString(list);
    }

    public ListConverter getListConverter() {
        return listConverter;
    }

    public void setListConverter(ListConverter listConverter) {
        this.listConverter = listConverter;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }
}