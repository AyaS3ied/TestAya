/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package j2se.xe.github.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the USERS table.
 */
public class UsersPk implements Serializable
{
	protected String userName;

	protected String password;

	/** 
	 * Sets the value of userName
	 */
	public void setUserName(String userName)
	{
		this.userName = userName;
	}

	/** 
	 * Gets the value of userName
	 */
	public String getUserName()
	{
		return userName;
	}

	/** 
	 * Sets the value of password
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/** 
	 * Gets the value of password
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Method 'UsersPk'
	 * 
	 */
	public UsersPk()
	{
	}

	/**
	 * Method 'UsersPk'
	 * 
	 * @param userName
	 * @param password
	 */
	public UsersPk(final String userName, final String password)
	{
		this.userName = userName;
		this.password = password;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof UsersPk)) {
			return false;
		}
		
		final UsersPk _cast = (UsersPk) _other;
		if (userName == null ? _cast.userName != userName : !userName.equals( _cast.userName )) {
			return false;
		}
		
		if (password == null ? _cast.password != password : !password.equals( _cast.password )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		if (userName != null) {
			_hashCode = 29 * _hashCode + userName.hashCode();
		}
		
		if (password != null) {
			_hashCode = 29 * _hashCode + password.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "j2se.xe.github.dto.UsersPk: " );
		ret.append( "userName=" + userName );
		ret.append( ", password=" + password );
		return ret.toString();
	}

}
