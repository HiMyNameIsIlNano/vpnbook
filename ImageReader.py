from PIL import Image
import pytesseract as tess

pytesseract.pytesseract.tesseract_cmd = r'/usr/local/lib/python2.7/site-packages/pytesseract/pytesseract.py'

print tess.image_to_string(Image.open('/home/Developer/Downloads/password.png'), lang='eng')
