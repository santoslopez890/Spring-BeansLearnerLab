package beansLearner.example.Beans.Models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public abstract class People <personType extends Person>implements Iterable<personType >{
    List<personType> personTypeList= new ArrayList<>();

    public People(List<personType> personList){
    this.personTypeList=personList;
    }
    @SafeVarargs
    public People(personType... persons){
        for (personType i:persons) { personTypeList.add(i); }
    }
    public void addPerson(personType person){
        personTypeList.add(person);
    }
    public void removePerson(personType person){
        personTypeList.remove(person);
    }
    public int sizeofPersons(){
        return personTypeList.size();
    }
    public void clearPersons(){
        personTypeList.clear();
    }
    public void addAllPersons(Iterable<personType> persons){
    personTypeList.addAll((Collection<? extends personType>) persons);
    }
    public personType findById(Long id){
        return (personType) personTypeList.stream().filter(p -> Objects.equals(p.getId(), id));
    }

    public List<personType> getPersonTypeList() {
        return personTypeList;
    }
}
