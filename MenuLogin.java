class MenuLogin {
 private final String usuarioCorreto = "Lucas";
 private final String senhaCorreta = "9999";
 public boolean autenticar(String usuario, String senha) {
 return usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta);
 }
}