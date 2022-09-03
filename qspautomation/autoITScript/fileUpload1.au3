WinWaitActive("Open");
Sleep(4000);
ControlFocus("Open","","Edit1");
Sleep(2000);
Send("C:\Users\pmpaw\Desktop\profile.jpg");
Sleep(2000);
ControlClick("Open","&Open","Button1");