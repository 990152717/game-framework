@echo on

@rem proto.exe·��
set protoExePath=E:\Work\game\
@rem ProtoBuf����·��
set protoBasePath=E:\Work\game\protobuf-protocol\
@rem .proto�ļ�·��
set protoFilePath=%protoBasePath%src\main\java\com\game\
@rem Java����·��
set javaOutPath=%protoBasePath%src\main\java 

for /r %protoFilePath% %%i in (*.proto) do (
	%protoExePath%protoc.exe --proto_path=%protoFilePath% --java_out=%javaOutPath% %%i
)

pause