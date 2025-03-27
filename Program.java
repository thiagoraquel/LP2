import java.util.ArrayList;

public class Program {
    private ArrayList<Instruction> instructions;

    public Program(ArrayList<Instruction> instructions){
        this.instructions = instructions;
    };

    /**
     * 
     */
    public Instruction getInstruction (int line) {
        if(line < this.instructions.size()) {
            return this.instructions.get(line);
        } else {
            return null;
        }
    }
}
