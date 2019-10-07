#!/usr/bin/env python
# coding: utf-8

# In[1]:


import pandas as pd
import warnings
from sklearn.externals import joblib
import tkinter.messagebox


# In[7]:

# 模型预测

# In[2]:

# 此处填入生成的csv文件
reader = pd.read_csv('t.csv')
reader.head()


# In[3]:


col = reader.columns
features = reader[col[2:]]
target = reader[col[1]]
features.head()


# In[4]:


# 标准化
ss = joblib.load('./ss.mod')
features = ss.transform(features)


# In[5]:


model = joblib.load('./xgboost.mod')


# In[8]:


test_preds = model.predict(features)

# test_accuracy = accuracy_score(target, test_preds)
# report_model = classification_report(target, test_preds)

# print('2016_UK')
# print(f"test Accuracy:  {(test_accuracy * 100):.4}%")
# print('\nClassification xgboost: \n', report_model)
dic = {1: 'Fatal', 2: 'Serious', 3: 'Slight'}

root = tkinter.Tk()
root.withdraw()
tkinter.messagebox.showinfo('当前安全等级', str(dic[test_preds[0]]))

