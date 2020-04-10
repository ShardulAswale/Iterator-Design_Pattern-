package iterator;

import java.util.ArrayList;

interface Iterator {

    public boolean hasNext();

    public Object next();
}

interface Aggregate {

    public void add(String a);

    public void remove();

    public Iterator getIterator();
}

class NameRepository implements Aggregate {

    public ArrayList<String> names;

    NameRepository() {
        this.names = new ArrayList<>();
    }

    private class NameIterator implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.size();
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names.get(index++);
            }
            return null;
        }
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    @Override
    public void add(String a) {
        this.names.add(a);
        System.out.println(a + " added");
    }

    @Override
    public void remove() {

    }
}

public class IteratorDemo {

    public static void main(String[] args) {
        NameRepository n = new NameRepository();
        n.add("John");
        n.add("Adam");
        n.add("Mike");
        n.add("Duke");
        Iterator i = n.getIterator();
        while (i.hasNext()) {
            System.out.println("Name : " + i.next());
        }
        /*for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        } */
    }
}
