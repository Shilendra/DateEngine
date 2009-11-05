package com.dateengine.tld;

import com.dateengine.models.Profile;

public class ProfileTags {
   public static boolean hasPet(Profile profile, String petName) {
      if(profile != null) {
         Profile.Pet pet = Profile.Pet.valueOf(petName);
         return profile.getPets().contains(pet);
      } else
         return false;
   }
}
