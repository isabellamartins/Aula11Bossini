private String username;
    private String password;

    private byte[] passwordBytes;

    public String getPassword() {
        return password;
@@ -23,6 +25,14 @@ public String getUsername() {
    public void setUsername(String username) {
        this.username = username;
    }

    public byte[] getPasswordBytes() {
		return passwordBytes;
	}

    public void setPasswordBytes(byte[] passwordBytes) {
		this.passwordBytes = passwordBytes;
	}

    @Override
    public String toString() {
