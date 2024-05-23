import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends Frame {
    private Label lblCount;
    private TextField tfcount;
    private Button btnCount;
    private int count=0;

    public Counter(){
        setLayout(new FlowLayout());
        lblCount = new Label("Counter");

        add(lblCount);

        tfcount = new TextField(count + "",10);
        tfcount.setEditable(false);
        add(tfcount);

        setTitle("Awt Counter");
        setSize(300,200);
        setVisible(true);

        btnCount = new Button("Count");
        add(btnCount);
        BtnCountListener listener = new BtnCountListener();
        btnCount.addActionListener(listener);

    }
    public static void main(String[] args) {
        new Counter();
    }

    private class BtnCountListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt){
            ++count;

            tfcount.setText(count + "");
        }
    
        
    }

}
