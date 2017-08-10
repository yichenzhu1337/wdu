public class ProfileRepo {

    private Profile profile;

    public ProfileRepo(Profile profile) {
        this.profile = profile;
    }

    public String getId(int id) {
        return this.profile.getById(id);
    }

}
