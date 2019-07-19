package com.jourwon.designpattern.j2ee.compositeentity;

/**
 * Description:创建组合实体。
 *
 * @author JourWon
 * @date 2019/7/17 17:28
 */
public class CompositeEntity {

    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }

}
