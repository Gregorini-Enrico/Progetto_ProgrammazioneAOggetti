package gg.project.service;

public class UrlService {

	public final static String URL = "https://graph.instagram.com/me/media?fields= caption&access_token=";
	/**
	 * Metodo per generare l'url corrispondente con l'access token
	 * @param token access token per accedere all'account IG
	 * @return String
	 */
	public static String getUrl(String token) {
		return "https://graph.instagram.com/me/media?fields= caption&access_token="+token;
	}
}
