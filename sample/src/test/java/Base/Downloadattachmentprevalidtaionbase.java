package Base;

import e5.hchb.model.downloadattachmentsfb.*;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Downloadattachmentprevalidtaionbase {
    public List<Value> value0() {
        List<Value> soe = new ArrayList<>();
        soe.add(Value.builder().operator(Value.Operator.IN).value("12/17/2302").build());
        soe.add(Value.builder().operator(Value.Operator.DOES_NOT_END_WITH).value("12/17/2302").build());
        return soe;
    }
    public List<Episodestatus> Value1() {
        List<Episodestatus> episode=new ArrayList<>();
        episode.add(Episodestatus.ALL);
        episode.add(Episodestatus.CURRENT);
        return episode;
    }
    public List<ServiceLine> Value2() {
        List<ServiceLine> value2= new ArrayList<>();
        value2.add(ServiceLine.HOME_HEALTH);
        return value2;
    }
    public List<Value__1> Value3() {
        List<Value__1> value3 = new ArrayList<>();
        value3.add(Value__1.builder().operator(Value__1.Operator.DOES_NOT_END_WITH).value("gsdfgsfdgsf").build());
        return value3;
    }
    public List<Value__2> Value4() {
        List<Value__2> value4 = new ArrayList<>();
        value4.add(Value__2.builder().operator(Value__2.Operator.IN).value("gsdfgsfdgsf").build());
        return value4;
    }
    public List<Value__3> Value5() {
        List<Value__3> value5 = new ArrayList<>();
        value5.add(Value__3.builder().operator(Value__3.Operator.CONTAINS).value("ydghcgs").build());
        return value5;
    }
    public List<Value__4> Value6() {
        List<Value__4> value6 = new ArrayList<>();
        value6.add(Value__4.builder().operator(Value__4.Operator.IN).value("03/31/5375 06:30:44 AM").build());
        return value6;
    }
    public List<FileNameDetail> Value7() {
        List<FileNameDetail> value7 = new ArrayList<>();
        value7.add(FileNameDetail.builder().existingFilename("aaa").requiredFilename("ssss").build());
        return value7;
    }
    public List<Value> invalidsoe() {
        List<Value> soe = new ArrayList<>();
        soe.add(Value.builder().operator(Value.Operator.IN).value("2302/17/12").build());
        soe.add(Value.builder().operator(Value.Operator.DOES_NOT_END_WITH).value("12/17/2302").build());
        return soe;
    }
    public List<Value__4> invalidimport() {
        List<Value__4> value6 = new ArrayList<>();
        value6.add(Value__4.builder().operator(Value__4.Operator.IN).value("03/31/5375 06:30:4114 A11M").build());
        return value6;
    }

}














