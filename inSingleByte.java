import javax.sound.midi.MidiChannel;

class inSingleByte
{
    public static void main(String[] args) {
        
        byte a=5,b=9;

        b=(byte)(b<<4);

        byte c=(byte)(a|b);

        System.out.println((c&0b11110000)>>4);

    }
}