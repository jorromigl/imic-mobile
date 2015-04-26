package com.imic.app.imic;

public class UserWrapper extends User{
	
	private UserType userType;

    public UserWrapper() {
        super();
    }
	
	public UserWrapper(User user) {
        super();
		setAddress(user.getAddress());
		setComments(user.getComments());
		setEmail(user.getEmail());
		setFolders(user.getFolders());
		setId(user.getId());
		setMoment(user.getMoment());
		setName(user.getName());
		setPhone(user.getPhone());
		setReferenceNumber(user.getReferenceNumber());
		setSurname(user.getSurname());
		setUserAccount(user.getUserAccount());
		setVersion(user.getVersion());
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
}
