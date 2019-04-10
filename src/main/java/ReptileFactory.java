public class ReptileFactory extends SpeciesFactory {

    public Animal getAnimal(String type) {
        if ("Snake".equals(type)){
            return new Snake();
    }else

    {
        return new Tyrannosaurus();
    }
}

}
