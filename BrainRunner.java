class BrainRunner {

    public static void main(String[] args) {

        Brain b1 = new Brain("Human Brain","Human",1.4,1400,860000000,4,"Thinking","Left","Grey","Complex",true,"None","Dr. Smith","NeuroLab","USA",2023,"Central","Adult",20,true);

        Brain b2 = new Brain("Human Brain","Human",1.3,1350,850000000,4,"Memory","Right","Grey","Complex",true,"None","Dr. Kumar","AIIMS","India",2022,"Central","Adult",19,true);

        Brain b3 = new Brain("Mouse Brain","Mouse",0.4,400,70000000,4,"Research","Left","Grey","Simple",true,"None","Dr. Lee","BioLab","Korea",2021,"Central","Adult",10,true);

        Brain b4 = new Brain("Monkey Brain","Monkey",0.9,900,300000000,4,"Learning","Right","Grey","Complex",true,"None","Dr. Patel","NeuroLab","India",2020,"Central","Adult",15,true);

        Brain b5 = new Brain("Human Brain","Human",1.5,1450,870000000,4,"Thinking","Left","Grey","Complex",false,"Alzheimer","Dr. Smith","NeuroLab","USA",2023,"Central","Adult",21,false);

        Brain b6 = new Brain("Dog Brain","Dog",0.7,700,160000000,4,"Smell","Right","Grey","Moderate",true,"None","Dr. Brown","VetLab","UK",2021,"Central","Adult",12,true);

        Brain b7 = new Brain("Cat Brain","Cat",0.6,600,150000000,4,"Reflex","Left","Grey","Moderate",true,"None","Dr. Kim","BioLab","Korea",2022,"Central","Adult",11,true);

        Brain b8 = new Brain("Human Brain","Human",1.4,1400,860000000,4,"Thinking","Right","Grey","Complex",true,"None","Dr. Kumar","AIIMS","India",2023,"Central","Adult",20,true);

        Brain b9 = new Brain("Rabbit Brain","Rabbit",0.5,500,100000000,4,"Movement","Left","Grey","Moderate",true,"None","Dr. Lee","BioLab","Korea",2020,"Central","Adult",9,true);

        Brain b10 = new Brain("Human Brain","Human",1.4,1400,860000000,4,"Thinking","Left","Grey","Complex",true,"None","Dr. Patel","NeuroLab","India",2024,"Central","Adult",20,true);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
        b6.display();
        b7.display();
        b8.display();
        b9.display();
        b10.display();
    }
}