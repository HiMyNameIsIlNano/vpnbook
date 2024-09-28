## VPNBook

This Scripts basically automates the download and setup process.


More Info:

OpenVPN is the best and most recommended open-source VPN software world-wide. It is the most secure VPN option. In order to use the service one needs to download the open-source OpenVPN Client and configure the certificate bundle from the official website (http://www.vpnbook.com/freevpn). This script opens a VPN connection without neither the need to install any GUI nor to download the password from the website (which gets changed every week).

## Dependencies

Minimal Dependencies for linux : openvpn, net-tools , curl , unrar

For Debian based:

```sh
sudo apt install openvpn net-tools curl unrar
```

For Arch based:

```sh
paru -S openvpn net-tools curl unrar
```

# How to use

- Clone the repo
- Install Dependencies
- ` chmod +x install   `
- `./install`
-   `./vpnbook`

### FAQ

#### Q) Password is invalid what do i do?

Ans : You have 2 options either enter the password manually when prompted or edit the ./vpnbook/login.conf and edit it put correct password in it while being on the choose the server screen

### TODO:

- [x] add .gitignore
- [x] Manual password entry
- [x] Improving fallback
- [x] IPV6 Masking for better security
- [x] Better logging
