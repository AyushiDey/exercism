class RnaTranscription {

    String transcribe(String dnaStrand) {
        if (dnaStrand.isEmpty()) return "";
        String rnaStrand = "";
        for(int i = 0; i<dnaStrand.length(); i++){
            char dnaChar = dnaStrand.charAt(i);
            if(dnaChar=='G')
                rnaStrand += 'C';
            else if(dnaChar=='C')
                rnaStrand+='G';
            else if(dnaChar=='T')
                rnaStrand+='A';
            else
                rnaStrand+='U';
        }
        return rnaStrand;
    }

}
