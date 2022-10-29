package BigCompiler;
enum TokenType{
    //All the single-char tokens
    LEFT_PAREN,
    RIGHT_PAREN,
    LEFT_BRACE,
    RIGHT_BRACE,
    COMMA,
    DOT,
    MINUS,
    PLUS,
    SLASH,
    ASTERISK,
    SEMICOLON,
    //All the double-char tokens
    BANG,
    BANG_EQUAL,
    EQUAL,
    EQUAL_EQUAL,
    GREATER,
    GREATER_EQUAL,
    LESS,
    LESS_EQUAL,

    //Literals
    IDENTIFIER,
    STRING,
    NUMBER,

    //Keywords
    AND,
    CLASS,
    ELSE,
    FALSE,
    FUN,
    IF,
    WHILE,
    DO,
    FOR,
    VAR,
    PRINT,
    RETURN,
    SUPER,
    THIS,
    TRUE,
    NIL,
    OR,
    EOF
}
