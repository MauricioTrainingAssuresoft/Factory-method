package chainOfResponsability;

public interface ISanatize {
    ShowData dataValidation(DataEntry data);
    void setNext(ISanatize sanatize);
}
