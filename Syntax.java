class Syntax {
    int syntaxId;
    String languageName;
    String variableDeclaration;
    String loopType;
    String conditionType;
    String functionSyntax;
    String classSyntax;
    String objectSyntax;
    String arraySyntax;
    String exceptionHandling;
    String commentType;
    String inputMethod;
    String outputMethod;
    String packageSyntax;
    String importSyntax;
    String inheritanceSyntax;
    String interfaceSyntax;
    String keywordExample;
    String bracketType;
    String statementEnd;

    public Syntax(int syntaxId, String languageName, String variableDeclaration, String loopType,
                  String conditionType, String functionSyntax, String classSyntax,
                  String objectSyntax, String arraySyntax, String exceptionHandling,
                  String commentType, String inputMethod, String outputMethod,
                  String packageSyntax, String importSyntax, String inheritanceSyntax,
                  String interfaceSyntax, String keywordExample, String bracketType,
                  String statementEnd) {
        this.syntaxId = syntaxId;
        this.languageName = languageName;
        this.variableDeclaration = variableDeclaration;
        this.loopType = loopType;
        this.conditionType = conditionType;
        this.functionSyntax = functionSyntax;
        this.classSyntax = classSyntax;
        this.objectSyntax = objectSyntax;
        this.arraySyntax = arraySyntax;
        this.exceptionHandling = exceptionHandling;
        this.commentType = commentType;
        this.inputMethod = inputMethod;
        this.outputMethod = outputMethod;
        this.packageSyntax = packageSyntax;
        this.importSyntax = importSyntax;
        this.inheritanceSyntax = inheritanceSyntax;
        this.interfaceSyntax = interfaceSyntax;
        this.keywordExample = keywordExample;
        this.bracketType = bracketType;
        this.statementEnd = statementEnd;
    }

    public void getSyntaxDetails() {
        System.out.println("SyntaxId: " + syntaxId);
        System.out.println("LanguageName: " + languageName);
        System.out.println("VariableDeclaration: " + variableDeclaration);
        System.out.println("LoopType: " + loopType);
        System.out.println("ConditionType: " + conditionType);
        System.out.println("FunctionSyntax: " + functionSyntax);
        System.out.println("ClassSyntax: " + classSyntax);
        System.out.println("ObjectSyntax: " + objectSyntax);
        System.out.println("ArraySyntax: " + arraySyntax);
        System.out.println("ExceptionHandling: " + exceptionHandling);
        System.out.println("CommentType: " + commentType);
        System.out.println("InputMethod: " + inputMethod);
        System.out.println("OutputMethod: " + outputMethod);
        System.out.println("PackageSyntax: " + packageSyntax);
        System.out.println("ImportSyntax: " + importSyntax);
        System.out.println("InheritanceSyntax: " + inheritanceSyntax);
        System.out.println("InterfaceSyntax: " + interfaceSyntax);
        System.out.println("KeywordExample: " + keywordExample);
        System.out.println("BracketType: " + bracketType);
        System.out.println("StatementEnd: " + statementEnd);
    }
}