package general.programinterfaces.before;

class AccountController {

    private final AccountService service;

    AccountController(AccountService service) {
        this.service = service;
    }

    // implementation skipped for brevity
}
