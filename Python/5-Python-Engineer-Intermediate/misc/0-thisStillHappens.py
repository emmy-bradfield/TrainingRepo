import re
import smtplib
from email.message import EmailMessage

password = "Apple.Bob1"


























with open ("./thisStillHappens.txt", encoding="utf8") as book:
    nolines = {w.lower() for ln in book for w in re.split(r'\n', ln) if w}
    wordList = {w.lower() for ln in nolines for w in re.split(r'\W+', ln) if w}
    sortedWords = sorted(wordList)

def sendMail():
    msg = EmailMessage()
    msg.set_content("\n".join(sortedWords))
    msg['Subject'] = 'happens still this'
    msg['From'] = 'emily-bradfield@outlook.com'
    msg['Bcc'] = 'mcewenhilary@gmail.com'
    s = smtplib.SMTP('smtp-mail.outlook.com', 587)
    s.starttls()
    s.ehlo()
    s.login('emily-bradfield@outlook.com', password)
    s.send_message(msg)
    s.quit()
    print("Message sent, SMTP protocal ended")

sendMail()